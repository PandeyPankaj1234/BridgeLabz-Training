package futurelogistics;

public class Utility {

    public GoodsTransport parseDetails(String input){
        String[] arr = input.split(":");
        String transportId = arr[0];

        if(!validateTransportId(transportId)){
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        int rating = Integer.parseInt(arr[2]);
        if(rating < 1 || rating > 5){
            System.out.println("Please provide a valid record");
            return null;
        }

        String transportType = arr[3];

        if(transportType.equalsIgnoreCase("BrickTransport")){
            return new BrickTransport(
                    arr[0],
                    arr[1],
                    rating,
                    Float.parseFloat(arr[4]),
                    Integer.parseInt(arr[5]),
                    Float.parseFloat(arr[6])
            );
        }
        else if(transportType.equalsIgnoreCase("TimberTransport")){
            return new TimberTransport(
                arr[0],
                arr[1],
                Integer.parseInt(arr[2]),
                Float.parseFloat(arr[4]),
                Float.parseFloat(arr[5]),
                arr[6],
                Float.parseFloat(arr[7])
            );
        }
        return null;
    }

    public boolean validateTransportId(String transportId){
        if(!transportId.startsWith("RTS") || transportId.length() != 7){
            return false;
        }

        for(int i = 3; i <= 5; i++){
            if(!Character.isDigit(transportId.charAt(i))){
                return false;
            }
        }

        char last = transportId.charAt(6);
        if(!(last >= 'A' && last <= 'Z')){
            return false;
        }

        return true;
    }

    public String findObjectType(GoodsTransport goodsTransport){
        if(goodsTransport instanceof TimberTransport){
            return "TimberTransport";
        }
        else if(goodsTransport instanceof BrickTransport){
            return "BrickTransport";
        }
        return "";
    }
}
