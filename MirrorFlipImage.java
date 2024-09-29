public class MirrorFlipImage{


    public static void displayImage(char[][] image){
        for (int i = 0; i < image.length; ++i){
            for (int j = 0; j < image[0].length; ++j){
                System.out.print(image[i][j]);
            }
        System.out.println();
        } 

    }

    public static char[][] horizontalMirror(char[][] image){
        for (int i = 0; i < image.length / 2; i++){
            for(int j = 0; j < image[0].length; j++){
                char holdingVar;
                holdingVar = image[i][j];
                image[i][j] = image[image.length - 1 - i][j];
                image[image.length - i - 1][j] = holdingVar;
            }
        } return image;
    }

    public static char[][] verticalMirror(char[][] image){
        for (int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length / 2; j++){
                char holdingVar; 
                holdingVar = image[i][j]; // temporary storage spot for the variable
                image[i][j] = image[i][image[0].length - 1 - j]; // gets the last element of the array and subtracts that from whatever "j" is
                image[i][image[0].length - j - 1] = holdingVar; // references value of image[i][j] in holding and assigns it to the image - 1
            }
        }
        return image;
    }

    public static void main(String[] args){
        char[][] myarr = {
            {'#', 'x', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', 'E', ' ', '#'},
            {'*', ' ', ' ', ' ', '|'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', '#', '#', 'y', '#'},
        };
       char[][] mirroredImage = horizontalMirror(verticalMirror(myarr));
       displayImage(mirroredImage);
    }

}