<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Número Par ou Impar</h2>

        <?php 
            
            $num = 4;

            if($num % 2 == 0){
                echo "O numero informado é par";
            }else{
                echo "O numero é impar";
            }

        ?>

</body>
</html>