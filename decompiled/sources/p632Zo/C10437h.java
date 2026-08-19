package p632Zo;

import p030B2.C0781s;
import p594Y9.C9895g4;
import p690cp.C12928n;
import p729ej.C13414e;
import p734ep.C13458b;
import p734ep.InterfaceC13457a;

/* JADX INFO: renamed from: Zo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10437h implements InterfaceC13457a {

    /* JADX INFO: renamed from: a */
    public static final C13414e f30912a;

    /* JADX INFO: renamed from: b */
    public static final C13414e f30913b;

    /* JADX INFO: renamed from: c */
    public static final C13414e f30914c;

    /* JADX INFO: renamed from: d */
    public static final C13414e f30915d;

    /* JADX INFO: renamed from: e */
    public static final C13414e f30916e;

    /* JADX INFO: renamed from: f */
    public static final C13414e f30917f;

    static {
        C9895g4 c9895g4M14951D = C13414e.m14951D();
        c9895g4M14951D.m10551C('A', 'Z');
        c9895g4M14951D.m10551C('a', 'z');
        C13414e c13414e = new C13414e(c9895g4M14951D);
        f30912a = c13414e;
        f30913b = c13414e;
        C9895g4 c9895g4M14953E = c13414e.m14953E();
        c9895g4M14953E.m10551C('0', '9');
        c9895g4M14953E.m10562t('-');
        f30914c = new C13414e(c9895g4M14953E);
        C9895g4 c9895g4M14953E2 = c13414e.m14953E();
        c9895g4M14953E2.m10562t('_');
        c9895g4M14953E2.m10562t(':');
        C13414e c13414e2 = new C13414e(c9895g4M14953E2);
        f30915d = c13414e2;
        C9895g4 c9895g4M14953E3 = c13414e2.m14953E();
        c9895g4M14953E3.m10551C('0', '9');
        c9895g4M14953E3.m10562t('.');
        c9895g4M14953E3.m10562t('-');
        f30916e = new C13414e(c9895g4M14953E3);
        C9895g4 c9895g4M14951D2 = C13414e.m14951D();
        c9895g4M14951D2.m10562t(' ');
        c9895g4M14951D2.m10562t('\t');
        c9895g4M14951D2.m10562t('\n');
        c9895g4M14951D2.m10562t((char) 11);
        c9895g4M14951D2.m10562t('\f');
        c9895g4M14951D2.m10562t('\r');
        c9895g4M14951D2.m10562t('\"');
        c9895g4M14951D2.m10562t('\'');
        c9895g4M14951D2.m10562t('=');
        c9895g4M14951D2.m10562t('<');
        c9895g4M14951D2.m10562t('>');
        c9895g4M14951D2.m10562t('`');
        f30917f = new C13414e(c9895g4M14951D2);
    }

    /* JADX INFO: renamed from: b */
    public static C10439j m10919b(C0781s c0781s, C13458b c13458b) {
        String strM4580g = c13458b.m14982d(c0781s, c13458b.m14991m()).m4580g();
        C12928n c12928n = new C12928n();
        c12928n.f41082g = strM4580g;
        return new C10439j(c12928n, c13458b.m14991m());
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0090 A[EDGE_INSN: B:122:0x0090->B:35:0x0090 BREAK  A[LOOP:1: B:30:0x007c->B:40:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[LOOP:1: B:30:0x007c->B:40:0x009a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0097 -> B:6:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p734ep.InterfaceC13457a
    /* JADX INFO: renamed from: a */
    public final p632Zo.C10439j mo10916a(p607Yo.C10124m r10) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p632Zo.C10437h.mo10916a(Yo.m):Zo.j");
    }
}
