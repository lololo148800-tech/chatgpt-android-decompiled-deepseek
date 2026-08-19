package p318Mh;

import android.gov.nist.core.Separators;
import java.util.List;
import p1155zi.C22016i1;
import p1155zi.C22020j1;
import p228J.AbstractC3812N;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: Mh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C5415o extends AbstractC3812N {

    /* JADX INFO: renamed from: o0 */
    public static final C5415o f17695o0 = new C5415o(3, (byte) 0);

    /* JADX INFO: renamed from: p0 */
    public static final List f17696p0;

    /* JADX INFO: renamed from: q0 */
    public static final List f17697q0;

    /* JADX INFO: renamed from: r0 */
    public static final List f17698r0;

    static {
        C5431w c5431w = C5431w.f17746g;
        c5431w.getClass();
        String str = "g/" + C5431w.f17751l.f17618e;
        c5431w.getClass();
        C5370J0 c5370j0 = C5431w.f17749j;
        String str2 = "c/" + c5370j0.f17618e;
        c5431w.getClass();
        String str3 = "conversation/" + c5370j0.f17618e;
        c5431w.getClass();
        String str4 = C5431w.f17747h.f17619f;
        c5431w.getClass();
        String str5 = c5370j0.f17619f;
        c5431w.getClass();
        C5370J0 c5370j1 = C5431w.f17758s;
        String str6 = c5370j1.f17619f;
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("conversation?", str4, Separators.AND, str5, Separators.AND);
        sbM9896o.append(str6);
        String string = sbM9896o.toString();
        c5431w.getClass();
        String str7 = c5370j1.f17619f;
        c5431w.getClass();
        C5370J0 c5370j2 = C5431w.f17757r;
        String str8 = c5370j2.f17619f;
        c5431w.getClass();
        C5370J0 c5370j3 = C5431w.f17753n;
        String str9 = c5370j3.f17619f;
        c5431w.getClass();
        C5370J0 c5370j4 = C5431w.f17759t;
        String str10 = c5370j4.f17619f;
        StringBuilder sbM9896o2 = AbstractC9306j0.m9896o(Separators.QUESTION, str7, Separators.AND, str8, Separators.AND);
        sbM9896o2.append(str9);
        sbM9896o2.append(Separators.AND);
        sbM9896o2.append(str10);
        f17696p0 = AbstractC17681o.m19382k(str, str2, str3, string, sbM9896o2.toString());
        c5431w.getClass();
        String str11 = c5370j1.f17614a;
        c5431w.getClass();
        String str12 = c5370j2.f17614a;
        c5431w.getClass();
        String str13 = c5370j3.f17614a;
        c5431w.getClass();
        f17697q0 = AbstractC17681o.m19382k(str11, str12, str13, c5370j4.f17614a);
        C22016i1 c22016i1 = C22020j1.Companion;
        c22016i1.getClass();
        c22016i1.getClass();
        f17698r0 = AbstractC17681o.m19382k("?mode=voice", "?q=hello%20how%20are%20you", "?model=gpt-4o-mini", "?mode=voice&q=conflict&model=gpt-4", "?hints=search", "?hints=search&q=Latest%20news", "c/6764a312-5160-800c-b73d-68d0341aa0bf");
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: D */
    public final List mo4514D() {
        return f17696p0;
    }

    @Override // p228J.AbstractC3812N
    /* JADX INFO: renamed from: F */
    public final List mo4515F() {
        return f17698r0;
    }
}
