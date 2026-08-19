package p523V9;

import androidx.compose.p650ui.graphics.AbstractC10864a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p403Qd.C6636i;
import p479Td.C7351f0;
import p635a1.InterfaceC10459q;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import ve.C20584h;

/* JADX INFO: renamed from: V9.f5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8087f5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25412a;

    /* JADX INFO: renamed from: a */
    public static final C20584h m8532a(C6636i c6636i) {
        AbstractC16544l.m18094g(c6636i, "<this>");
        ArrayList arrayListM8533b = m8533b(c6636i);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM8533b.iterator();
        while (it.hasNext()) {
            C20584h c20584h = ((C7351f0) it.next()).f23305t;
            if (c20584h != null) {
                arrayList.add(c20584h);
            }
        }
        return (C20584h) AbstractC17680n.m19353c0(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m8533b(C6636i c6636i) {
        AbstractC16544l.m18094g(c6636i, "<this>");
        ArrayList arrayListM8420h = AbstractC8042a0.m8420h(c6636i);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM8420h) {
            if (((C7351f0) obj).f23302q) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10459q m8534c(InterfaceC10459q interfaceC10459q, float f10) {
        return f10 == 0.0f ? interfaceC10459q : AbstractC10864a.m11306b(interfaceC10459q, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, null, false, 0, 130815);
    }
}
