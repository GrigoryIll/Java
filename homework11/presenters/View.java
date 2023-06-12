package homework11.presenters;

import homework11.models.Table;

import java.sql.Date;
import java.util.Collection;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTablesView(Collection<Table> tables);

    void updateReservationTableResult(int reservationNo);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
