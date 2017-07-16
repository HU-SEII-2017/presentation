@Test
public void p1() {
	assertEquals(Language.C, new Program().getLanguage("C"));
}

@Test
public void p2() {
	assertEquals(Language.CPP, new Program().getLanguage("CPP"));
}

@Test
public void p3() {
	assertEquals(Language.JAVA, new Program().getLanguage("JAVA"));
}

@Test
public void n1() {
	assertEquals(Language.PYTHON, new Program().getLanguage("PYTHON"));
}
