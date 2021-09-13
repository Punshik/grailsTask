package helloworld

class BootStrap {
    def itemService

    def init = { servletContext ->
    if(itemService.checkItemIsEmpty()){
        for(int i : 0..9){
            String nameValue = 1 + (String) (Math.random()*100000);
            Float costValue = 1 + (Float) (Math.random()*100000);
            String descriptionValue = 1 + (String) (Math.random()*1000);
            itemService.setItem(nameValue,costValue,descriptionValue);
        }
    }
    }
    def destroy = {
    }
}
