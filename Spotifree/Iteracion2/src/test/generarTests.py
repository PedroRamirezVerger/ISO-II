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
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
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
		Cancion canciontest = new Cancion(id, 0, null, null, null, null, 0);
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

