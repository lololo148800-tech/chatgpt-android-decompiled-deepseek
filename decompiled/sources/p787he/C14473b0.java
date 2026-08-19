package p787he;

import cn.UfGr.EhBykzn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p1126yd.C21471f0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C21984a1;
import p1155zi.C22011h0;
import p152Fm.AbstractC2922d;
import p195Hh.C3430e;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p403Qd.C6657s0;
import p479Td.C7351f0;
import p523V9.AbstractC8040Z5;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p925oe.C18077B;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: he.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14473b0 {

    /* JADX INFO: renamed from: a */
    public final C18077B f45591a;

    /* JADX INFO: renamed from: b */
    public final C17627a f45592b;

    /* JADX INFO: renamed from: c */
    public final C3430e f45593c = AbstractC8168p6.m8749b("VariantsInStreamManager", null);

    public C14473b0(C18077B c18077b, C17627a c17627a) {
        this.f45591a = c18077b;
        this.f45592b = c17627a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: a */
    public final Object m15994a(C6636i c6636i, Integer num, List list, AbstractC19687c abstractC19687c) {
        C14468Y c14468y;
        int i10;
        String str;
        C6636i c6636iM7162a;
        Object objM8412h;
        C14473b0 c14473b0;
        C6636i c6636i2;
        if (abstractC19687c instanceof C14468Y) {
            c14468y = (C14468Y) abstractC19687c;
            int i11 = c14468y.f45576q0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c14468y.f45576q0 = i11 - Integer.MIN_VALUE;
            } else {
                c14468y = new C14468Y(this, abstractC19687c);
            }
        } else {
            c14468y = new C14468Y(this, abstractC19687c);
        }
        C14468Y c14468y2 = c14468y;
        Object obj = c14468y2.f45574o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = c14468y2.f45576q0;
        if (i12 == 0) {
            AbstractC9233X.m9807c(obj);
            C6657s0 c6657s0 = c6636i.f21398t;
            if (c6657s0 == null) {
                return c6636i;
            }
            String strM7170b = c6657s0.m7170b();
            C6394e c6394e = c6636i.f21399u;
            Collection collectionValues = c6394e.f20814b.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collectionValues) {
                String str2 = ((C7351f0) ((C6397h) obj2).f20822d).f23287b;
                if (str2 == null ? false : str2.equals(strM7170b)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() < 2) {
                return c6636i;
            }
            Iterator it = arrayList.iterator();
            C6397h c6397h = (C6397h) AbstractC17680n.m19351a0(c6394e.m7028c(((C6397h) it.next()).f20819a));
            C6397h c6397h2 = (C6397h) AbstractC17680n.m19351a0(c6394e.m7028c(((C6397h) it.next()).f20819a));
            AbstractC0575H.m1156D(this.f45592b, null, null, new C14469Z(this, c6657s0, c6397h, c6397h2, c6636i, num, list, null), 3);
            if (num == null) {
                i10 = 1;
            } else {
                i10 = 1;
                if (num.intValue() == 1) {
                    str = ((C21984a1) c6397h2.f20819a).f69607Y;
                }
                c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, str, null, null, null, null, null, null, null, null, false, null, null, 1572847);
                c14468y2.f45572Y = this;
                c14468y2.f45573Z = c6636iM7162a;
                c14468y2.f45576q0 = i10;
                objM8412h = AbstractC8040Z5.m8412h(this.f45591a, c6636iM7162a, c14468y2);
                if (objM8412h == enumC19250a) {
                    return enumC19250a;
                }
                c14473b0 = this;
                c6636i2 = c6636iM7162a;
                obj = objM8412h;
            }
            str = ((C21984a1) c6397h.f20819a).f69607Y;
            c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, str, null, null, null, null, null, null, null, null, false, null, null, 1572847);
            c14468y2.f45572Y = this;
            c14468y2.f45573Z = c6636iM7162a;
            c14468y2.f45576q0 = i10;
            objM8412h = AbstractC8040Z5.m8412h(this.f45591a, c6636iM7162a, c14468y2);
            if (objM8412h == enumC19250a) {
                return enumC19250a;
            }
            c14473b0 = this;
            c6636i2 = c6636iM7162a;
            obj = objM8412h;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6636i2 = c14468y2.f45573Z;
            c14473b0 = c14468y2.f45572Y;
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC8160o6.m8727b(c14473b0.f45593c, "Failed to update conversation", ((AbstractC21933K1) abstractC21955Q1).f69485a, 4);
        }
        return c6636i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public final Object m15995b(C6636i c6636i, C21471f0 c21471f0, AbstractC19687c abstractC19687c) {
        C14471a0 c14471a0;
        if (abstractC19687c instanceof C14471a0) {
            c14471a0 = (C14471a0) abstractC19687c;
            int i10 = c14471a0.f45589o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14471a0.f45589o0 = i10 - Integer.MIN_VALUE;
            } else {
                c14471a0 = new C14471a0(this, abstractC19687c);
            }
        } else {
            c14471a0 = new C14471a0(this, abstractC19687c);
        }
        Object objM8412h = c14471a0.f45587Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14471a0.f45589o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM8412h);
            int i12 = c21471f0.f68069b;
            String str = ((C21984a1) c6636i.m7164c().f20819a).f69607Y;
            AbstractC2922d.f8758Y.getClass();
            boolean zNextBoolean = AbstractC2922d.f8759Z.mo3725f().nextBoolean();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C17690x c17690x = C17690x.f56481Y;
            C6636i c6636iM7162a = C6636i.m7162a(c6636i, null, null, null, null, null, null, null, null, null, null, null, null, false, new C6657s0(i12, c21471f0.f68070c, str, zNextBoolean, jCurrentTimeMillis, c17690x, c17690x), null, 1572863);
            c14471a0.f45589o0 = 1;
            objM8412h = AbstractC8040Z5.m8412h(this.f45591a, c6636iM7162a, c14471a0);
            if (objM8412h == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException(EhBykzn.yDUjiY);
            }
            AbstractC9233X.m9807c(objM8412h);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM8412h;
        if (abstractC21955Q1 instanceof C21952P1) {
            ((C22011h0) ((C21952P1) abstractC21955Q1).f69511a).getClass();
            return new C21952P1(C17296C.f55119a);
        }
        if ((abstractC21955Q1 instanceof C21929J1) || (abstractC21955Q1 instanceof AbstractC21933K1)) {
            return abstractC21955Q1;
        }
        throw new C0644w();
    }
}
