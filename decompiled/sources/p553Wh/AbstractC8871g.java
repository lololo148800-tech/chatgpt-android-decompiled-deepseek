package p553Wh;

import android.content.Context;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import gd.C14007x0;
import java.util.UUID;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p092Dc.C1991h;
import p1143z4.AbstractC21769K;
import p1143z4.C21795y;
import p1155zi.EnumC21895B;
import p153Fn.C2925c;
import p229J0.C3952M3;
import p334Na.AbstractC5695b;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.C6035w;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8740x3;

/* JADX INFO: renamed from: Wh.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8871g {

    /* JADX INFO: renamed from: a */
    public static final UUID f27154a = UUID.randomUUID();

    /* JADX INFO: renamed from: a */
    public static final C8870f m9550a(EnumC21895B enumC21895B, C6021p c6021p, int i10) {
        C21795y c21795yM6139f;
        c6021p.m6524S(-1282954674);
        if ((i10 & 1) != 0) {
            enumC21895B = EnumC21895B.f69419Z;
        }
        EnumC21895B enumC21895B2 = enumC21895B;
        c6021p.m6524S(1391249190);
        boolean zM8729d = AbstractC8160o6.m8729d(C14007x0.f44089c, c6021p);
        if (zM8729d) {
            c6021p.m6524S(1965980884);
            c21795yM6139f = AbstractC5695b.m6139f(new AbstractC21769K[0], c6021p);
            c6021p.m6553p(false);
        } else {
            if (zM8729d) {
                c6021p.m6524S(1965860989);
                c6021p.m6553p(false);
                throw new C0644w();
            }
            c6021p.m6524S(812148517);
            c6021p.m6521P(1965982222, f27154a);
            c21795yM6139f = AbstractC5695b.m6139f(new AbstractC21769K[0], c6021p);
            c6021p.m6553p(false);
            c6021p.m6553p(false);
        }
        AbstractC8740x3.m9476b(c21795yM6139f, false, false, c6021p, 0, 3);
        c6021p.m6553p(false);
        Object obj = C6013l.f19514a;
        c6021p.m6524S(-191180977);
        Object objM6514H = c6021p.m6514H();
        if (objM6514H == obj) {
            objM6514H = new C3952M3();
            c6021p.m6537c0(objM6514H);
        }
        C3952M3 c3952m3 = (C3952M3) objM6514H;
        Object objM530s = AbstractC0168G.m530s(-191178321, c6021p, false);
        if (objM530s == obj) {
            objM530s = new C3952M3();
            c6021p.m6537c0(objM530s);
        }
        C3952M3 c3952m4 = (C3952M3) objM530s;
        c6021p.m6553p(false);
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == obj) {
            objM6514H2 = AbstractC0168G.m529r(C5997d.m6417D(c6021p), c6021p);
        }
        C2925c c2925c = ((C6035w) objM6514H2).f19668Y;
        c6021p.m6524S(61895717);
        C1991h c1991h = new C1991h(((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources(), 1);
        c6021p.m6553p(false);
        c6021p.m6524S(-191173104);
        boolean zM6542f = c6021p.m6542f(c21795yM6139f) | c6021p.m6542f(c3952m3) | c6021p.m6542f(c2925c);
        Object objM6514H3 = c6021p.m6514H();
        if (zM6542f || objM6514H3 == obj) {
            Object c8870f = new C8870f(enumC21895B2, c21795yM6139f, c3952m3, c3952m4, c1991h, c2925c);
            c6021p.m6537c0(c8870f);
            objM6514H3 = c8870f;
        }
        C8870f c8870f2 = (C8870f) objM6514H3;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c8870f2;
    }
}
