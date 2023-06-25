package com.project.sibarevents.data

import com.project.sibarevents.data.model.EventModel


val name ="Mora in El Salvador"
val day_hour ="Friday apr 28 2023 at 8:00 pm"
val location ="Nuevo Cuscatlan"
val description = "Las localidades y los precios de las entradas son los siguientes : Paraíso \$85, Microdosis 1 y 2 \$65, VIP \$50 y General \$30.\n" + "\n “Volando”, “Una vez” y “512”, \"Pégate\", \"Tuyo\", \"Tus lágrimas\", \"La inocente\" y \"Memorias\" forman parte de los más grandes éxitos del artista boricua y que interpretará el próximo 28 de abril en Nuevo Cuscatlán."
val category = "Concert"
val banner = "https://cdn-pro.elsalvador.com/wp-content/uploads/2023/02/mora-elsalvador.jpg"


val name2 ="Danny Ocean in El Salvador"
val day_hour2 ="Thursday jun 22 2023 at 8:00 pm "
val location2 ="San Salvador"
val description2 = "La fecha prevista en la que llegará al país es el 22 de junio en San Salvador. Hasta el momento se desconoce la localidad donde se llevará a cabo el concierto y el precio de las entradas. Por lo tanto, sus fanáticos deben estar pendientes de más información."
val category2 = "Concert"
val banner2 = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQQGknBPV4GmGuM6VluOnA6fR_EeS-_AGP8Nr5XsaMuOxZ8XElH"


val name3 ="Juegos de Centroamerica y\n" + "del Caribe"
val day_hour3 ="Friday jun 23 2023"
val location3 ="San Salvador"
val description3 = "El presidente del Comité Organizador de los Juegos Centroamericanos y del Caribe San Salvador 2023 (COSSAN2023), Yamil Bukele, presentó la noche del lunes la imagen oficial de la vigesimocuarta edición de la justa, que albergará la capital salvadoreña entre el 23 de junio y el 8 de julio de este año"
val category3 = "Sports"
val banner3 = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Logo-san-salvador-2023.png/320px-Logo-san-salvador-2023.png"

var events = mutableListOf(
    EventModel(name, day_hour, location, description, category, banner),
    EventModel(name2, day_hour2, location2, description2, category2, banner2),
    EventModel(name3, day_hour3, location3, description3, category3, banner3),

    )