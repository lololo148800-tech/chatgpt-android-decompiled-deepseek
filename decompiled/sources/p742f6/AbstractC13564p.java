package p742f6;

import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import p520V5.C7781j;
import p591Y5.C9659j;
import p764g6.AbstractC13821a;
import p802i6.C14935a;

/* JADX INFO: renamed from: f6.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13564p {

    /* JADX INFO: renamed from: a */
    public static final C15384c f42910a = C15384c.m16635u("k");

    /* JADX INFO: renamed from: a */
    public static ArrayList m15097a(AbstractC13821a abstractC13821a, C7781j c7781j, float f10, InterfaceC13548D interfaceC13548D, boolean z6) {
        ArrayList arrayList = new ArrayList();
        if (abstractC13821a.mo15424P() == 6) {
            c7781j.m8039a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC13821a.mo15430e();
        while (abstractC13821a.hasNext()) {
            if (abstractC13821a.mo15427T(f42910a) != 0) {
                abstractC13821a.mo15421D();
            } else if (abstractC13821a.mo15424P() == 1) {
                abstractC13821a.mo15429a();
                if (abstractC13821a.mo15424P() == 7) {
                    arrayList.add(AbstractC13563o.m15096b(abstractC13821a, c7781j, f10, interfaceC13548D, false, z6));
                } else {
                    while (abstractC13821a.hasNext()) {
                        arrayList.add(AbstractC13563o.m15096b(abstractC13821a, c7781j, f10, interfaceC13548D, true, z6));
                    }
                }
                abstractC13821a.mo15433k();
            } else {
                arrayList.add(AbstractC13563o.m15096b(abstractC13821a, c7781j, f10, interfaceC13548D, false, z6));
            }
        }
        abstractC13821a.mo15434m();
        m15098b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m15098b(ArrayList arrayList) {
        int i10;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            C14935a c14935a = (C14935a) arrayList.get(i11);
            i11++;
            C14935a c14935a2 = (C14935a) arrayList.get(i11);
            c14935a.f46531h = Float.valueOf(c14935a2.f46530g);
            if (c14935a.f46526c == null && (obj = c14935a2.f46525b) != null) {
                c14935a.f46526c = obj;
                if (c14935a instanceof C9659j) {
                    ((C9659j) c14935a).m10246d();
                }
            }
        }
        C14935a c14935a3 = (C14935a) arrayList.get(i10);
        if ((c14935a3.f46525b == null || c14935a3.f46526c == null) && arrayList.size() > 1) {
            arrayList.remove(c14935a3);
        }
    }
}
