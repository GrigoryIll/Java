package homework11;

import homework11.models.TableModel;
import homework11.presenters.BookingPresenter;
import homework11.views.BookingView;

import java.util.Date;

import javax.annotation.processing.SupportedOptions;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  Метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 101, "Станислав");
        bookingView.changeReservationTableEvent(1001, new Date(), 102, "Станислав");
        
    }

}
