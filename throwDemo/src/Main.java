public class Main {

    public static void main(String[] args) {
	        AccountManager manager = new AccountManager();
            System.out.println("HESAP= " +manager.getBalance());
            manager.deposit(100);
            System.out.println("HESAP= " +manager.getBalance());
            try{
                manager.withdraw(90);
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }

            System.out.println("HESAP= " +manager.getBalance());
        try{
            manager.withdraw(90);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
            System.out.println("HESAP= " +manager.getBalance());




    }
}
