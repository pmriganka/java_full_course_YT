
enum Status {
    PENDING, APPROVED, REJECTED, SUCCESS
}

public class EnumDemo {
    
    public static void main(String[] args) {
        
        Status[] s = Status.values();
        for (Status status : s) {
            System.out.println(status + " : " + status.ordinal());
        }


        Status ss = Status.PENDING;

        if (ss == Status.PENDING) {
            System.out.println("Status is pending");
        }
        else if (ss == Status.APPROVED) {
            System.out.println("Status is approved");
        }
        else if (ss == Status.REJECTED) {
            System.out.println("Try Again");
        }
        else {
            System.out.println("Done");
        }

         Status st = Status.SUCCESS;

         switch(st) {

            case PENDING:
                System.out.println("Status is pending");
                break;

            case APPROVED:
                System.out.println("Status is approved");
                break;
            case REJECTED:
                System.out.println("Try Again");
                break;
                
            case SUCCESS:
                System.out.println("Done");
                break;
         }

    }
}
