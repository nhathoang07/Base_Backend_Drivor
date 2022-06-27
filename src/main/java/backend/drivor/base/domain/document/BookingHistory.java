package backend.drivor.base.domain.document;
import backend.drivor.base.domain.model.BookingLocation;
import backend.drivor.base.domain.model.VehicleInfo;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "booking_history")
@Entity
public class BookingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String request_id;
    private String requester_account_id;
    private VehicleInfo vehicle;
    private long requested_at;
    private BookingLocation from;
    private BookingLocation to;
    private Double distance;
    private String distance_unit;
    private Integer hours;
    private long amount; // satoshi
    private long waiting_fee;
    private String price_currency;
    private String pay_type; // cash/wallet,...
    private String waiting_pay_type;
    private String status;
    private String waiting_fee_status;
    private long total_amount;
    private long driver_amount;
    private long merchant_amount;
    private long drivor_amount;

    private Long driver_account_id;
    private long accepted_at;
    private long canceled_at;
    private long expired_at;
    private long arrived_at;
    private long started_at;
    private long finished_at;
    private boolean requester_rated;
    private boolean driver_rated;
    private Long canceled_by;
    private String canceled_comment;

    private boolean billing_updated;
    private String billing_status;
    private String billing_transaction_id;

    private String note;
}
