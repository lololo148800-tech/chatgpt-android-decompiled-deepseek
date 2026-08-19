package p523V9;

import java.util.ArrayList;
import java.util.Arrays;
import p049Bm.InterfaceC1439n;
import p1091wn.C21030k;
import p165G9.C3024j;
import p520V5.C7781j;
import p660b6.C11249a;
import p660b6.C11250b;
import p675c6.C11668c;
import p742f6.AbstractC13564p;
import p742f6.C13554f;
import p764g6.AbstractC13821a;
import p764g6.C13822b;
import p779h6.AbstractC14418g;
import p802i6.C14935a;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.A5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7846A5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f24738a;

    /* JADX INFO: renamed from: a */
    public static C21030k m8098a(InterfaceC1439n interfaceC1439n) {
        C21030k c21030k = new C21030k();
        c21030k.f66911p0 = AbstractC8154o0.m8710a(interfaceC1439n, c21030k, c21030k);
        return c21030k;
    }

    /* JADX INFO: renamed from: b */
    public static C11249a m8099b(C13822b c13822b, C7781j c7781j) {
        return new C11249a(0, AbstractC13564p.m15097a(c13822b, c7781j, 1.0f, C13554f.f42881Z, false));
    }

    /* JADX INFO: renamed from: c */
    public static C11250b m8100c(AbstractC13821a abstractC13821a, C7781j c7781j, boolean z6) {
        return new C11250b(AbstractC13564p.m15097a(abstractC13821a, c7781j, z6 ? AbstractC14418g.m15932c() : 1.0f, C13554f.f42882o0, false), 6);
    }

    /* JADX INFO: renamed from: d */
    public static C11249a m8101d(C13822b c13822b, C7781j c7781j, int i10) {
        C3024j c3024j = new C3024j(3);
        c3024j.f9112Z = i10;
        ArrayList arrayListM15097a = AbstractC13564p.m15097a(c13822b, c7781j, 1.0f, c3024j, false);
        for (int i11 = 0; i11 < arrayListM15097a.size(); i11++) {
            C14935a c14935a = (C14935a) arrayListM15097a.get(i11);
            C11668c c11668c = (C11668c) c14935a.f46525b;
            C11668c c11668c2 = (C11668c) c14935a.f46526c;
            if (c11668c != null && c11668c2 != null) {
                float[] fArr = c11668c.f35331a;
                int length = fArr.length;
                float[] fArr2 = c11668c2.f35331a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i12 = 0;
                    for (int i13 = 0; i13 < length2; i13++) {
                        float f11 = fArr3[i13];
                        if (f11 != f10) {
                            fArr3[i12] = f11;
                            i12++;
                            f10 = fArr3[i13];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i12);
                    c14935a = new C14935a(c11668c.m13023b(fArrCopyOfRange), c11668c2.m13023b(fArrCopyOfRange));
                }
            }
            arrayListM15097a.set(i11, c14935a);
        }
        return new C11249a(1, arrayListM15097a);
    }

    /* JADX INFO: renamed from: e */
    public static C11249a m8102e(AbstractC13821a abstractC13821a, C7781j c7781j) {
        return new C11249a(2, AbstractC13564p.m15097a(abstractC13821a, c7781j, 1.0f, C13554f.f42883p0, false));
    }

    /* JADX INFO: renamed from: f */
    public static C11249a m8103f(C13822b c13822b, C7781j c7781j) {
        return new C11249a(3, AbstractC13564p.m15097a(c13822b, c7781j, AbstractC14418g.m15932c(), C13554f.f42885r0, true));
    }
}
