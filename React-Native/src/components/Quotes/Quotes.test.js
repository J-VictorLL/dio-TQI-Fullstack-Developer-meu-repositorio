import {render, screen} from '@testing-library/react';
import {Quotes} from './Quotes';

const quote = 'teste quote';
const speaker = 'random speaker';

test('renders received quote, speaker and a button', ()=>{
    render(<Quotes quote={quote} speaker={speaker}/>);

    const buttonEl = screen.getByRole('button');
    const quoteEL = screen.getByText(quote);
    const speakerEL = screen.getByText('- ${speaker}');

    expect(buttonEl).toBeInTheDocument();
    expect(quoteEL).toBeInTheDocument();
    expect(speakerEL).toBeInTheDocument();
})


test('calls a callback when a button is pressed', ()=>{
    const callback = jest.fn();
    
    render(<Quotes quote={quote} speaker={speaker} onUpdate={callback}/>);

    const buttonEl = screen.getByRole('button');

    fireEvent.click(buttonEl);

    expect(callback).toHaveBeenCalledTimes(1);
})