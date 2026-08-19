package je;

import af.C10561Q;
import af.C10585m;
import java.util.List;
import p349O0.C6018n0;
import p349O0.C6021p;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8662k3;
import p553Wh.AbstractC8873i;
import p553Wh.C8870f;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: je.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16205d {

    /* JADX INFO: renamed from: a */
    public static final List f50283a = AbstractC17681o.m19382k("Summer rain echoes\nPattering on the rooftops\nDreams washed away too\n", "Under a full moon\nThe night's secrets softly speak\nWhispering in light\n", "Petals in the wind\nFluttering like butterflies\nFarewell to spring's song\n", "Glittering snowfall\nWinter's icy touch adorns\nEarth in silver robes\n", "On an autumn eve\nCrimson leaves perform ballet\nDancing with the breeze\n", "In the city's heart\nNeon lights reflect on glass\nNight finds a new dawn\n", "Mountain's mighty peak\nBeneath the vast canvas sky\nTimeless, it stands firm\n", "Ocean's melody\nIn each wave, the world's rhythm\nSymphony of life\n", "Sun sets, stars emerge\nThe cosmos unfolds its tale\nNight's silent poem\n", "Dew-kissed morning grass\nCrisp beneath the newborn sun\nDay's first sigh of life\n");

    /* JADX INFO: renamed from: a */
    public static final void m17804a(InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        c6021p.m6526U(-1373756690);
        int i11 = i10 | 6;
        if ((i11 & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            interfaceC10459q = C10456n.f30959Y;
            AbstractC8662k3.m9350a(interfaceC10459q, null, 0L, AbstractC8411c.m8969c(-935550505, c6021p, new C10585m((C8870f) c6021p.m6548k(AbstractC8873i.f27157a), 6)), false, AbstractC16204c.f50282b, c6021p, (i11 & 14) | 199680, 22);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C10561Q(interfaceC10459q, i10, 14);
        }
    }
}
