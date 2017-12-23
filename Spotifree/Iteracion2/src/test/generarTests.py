#!/usr/bin/python3

casos_duracion = ["-5", "0", "1", "12.9", "999", "1000"]
casos_nombre   = ["", "a", "abcde", 
			"qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiiooooop"
			+ "pppphqqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphq"
			+ "qqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwww"
			+ "wweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeee"
			+ "rrrrrtttttyyyyyuuuuuiiiiioooooppppph",
			"qqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeeerrrrrttttt"
			+ "yyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiiooooop"
			+ "pppphqqqqqwwwwweeeeerrrrrtttttyyyyyuuuuuiiiiioooooppppphqqqqqwwwwweeeeerr"
			+ "rrrtttttyyyyyuuuuuiiiiioooooppppphg"]
casos_estilo = casos_nombre
casos_artista = casos_nombre
casos_album = casos_nombre
casos_precio = ["-1", "0", "1", "5.5", "30", "31"]

oraculoOK = '''
	@Test
	public void test{}() {{
		int id={};
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
		try {{
			canciontest.leer();
		}} catch (IOException inesperada) {{
			inesperada.printStackTrace();
			fail();
		}} catch (Exception inesperada) {{
			inesperada.printStackTrace();
			fail();
		}}
	}}
'''

oraculoFail = '''
	@Test
	public void test{}() {{
		int id={};
		Cancion canciontest = new Cancion(0, id, null, null, null, null, 0);
		try {{
			canciontest.leer();
			fail();
		}} catch (IOException inesperada) {{
			inesperada.printStackTrace();
			fail();
		}} catch (Exception esperada) {{
		}}
	}}
'''

indices_duracion_ok = [2,4,5]
indices_nombre_ok = [1,2,3]
indices_estilo_ok = indices_nombre_ok
indices_artista_ok = indices_nombre_ok
indices_album_ok = indices_nombre_ok
indices_precio_ok = [1,2,3,4,5]


for i in range(len(casos_duracion)):
    if i in indices_duracion_ok:
        print(oraculoOK.format("DuracionValid" + str(i+1), i+1))
    else:
        print(oraculoFail.format("DuracionInvalid" + str(i+1), i+1))

base = len(casos_duracion)

for i in range(len(casos_nombre)):
    if i in indices_nombre_ok:
        print(oraculoOK.format("NombreValid" + str(i+1), base+i+1))
    else:
        print(oraculoFail.format("NombreInvalid" + str(i+1), base+i+1))

base += len(casos_nombre)

for i in range(len(casos_estilo)):
    if i in indices_estilo_ok:
        print(oraculoOK.format("EstiloValid" + str(i+1), base+i+1))
    else:
        print(oraculoFail.format("EstiloInvalid" + str(i+1), base+i+1))

base += len(casos_estilo)

#for i in range(len(casos_artista)):
#    if i in indices_artista_ok:
#        print(oraculoOK.format("ArtistaValid" + str(i+1), base+i+1))
#    else:
#        print(oraculoFail.format("ArtistaInvalid" + str(i+1), base+i+1))

base += len(casos_artista)

#for i in range(len(casos_album)):
#    if i in indices_album_ok:
#        print(oraculoOK.format("AlbumValid" + str(i+1), base+i+1))
#    else:
#        print(oraculoFail.format("AlbumInvalid" + str(i+1), base+i+1))

base += len(casos_album)

for i in range(len(casos_precio)):
    if i in indices_precio_ok:
        print(oraculoOK.format("PrecioValid" + str(i+1), base+i+1))
    else:
        print(oraculoFail.format("PrecioInvalid" + str(i+1), base+i+1))





