import {render, screen} from '@testing-library/react';
import App from './App';
import {rest} from 'msw';
import {setupServer} from 'msw/node';

const response = {speaker: 'Speaker', quote: 'test quote'};


const server = setupServer(
    rest.get(process.env.REACT_APP_API, (req, res, ctx) => {
        return res(ctx.json(response));
    })
);

beforeAll(()=> server.listem());
afterEach(()=> server.resetHandlers());
afterAll(()=> server.close());

test('transform json response into object', async () =>{
    const quote = await getQuote();

    expect(quote).toStrictEqual(response)
})

test('renders the app with a button, a quote and a button', ()=>{
    render(<App />);

    const buttonEl = screen.getByRole('button');
    const imageEl = screen.getByRole('img');
    const textEL = screen.getByText(/Speaker/);

    expect(buttonEl).toBeInTheDocument();
    expect(imageEl).toBeInTheDocument();
    expect(textEL).toBeInTheDocument();
})

test('calls api on button click and updates its text',async ()=>{
    render(<App />);

    const buttonEl = screen.getByRole('button');

    fireEvent.click(buttonEl)

    const quoteEl = await screen.findByText(response.quote);

    expect(quoteEl).toBeInTheDocument();
})