package p523V9;

import androidx.compose.p650ui.draw.ShadowGraphicsLayerElement;
import np.AbstractC17712d;
import np.InterfaceC17710b;
import p1051v0.C20416d;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14325C;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.h5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8103h5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25439a;

    /* JADX INFO: renamed from: a */
    public static final InterfaceC17710b m8580a(String str) {
        return AbstractC17712d.m19445b().m19898a().mo19435a(str);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10459q m8581b(InterfaceC10459q interfaceC10459q, float f10, C20416d c20416d, boolean z6, int i10) {
        if ((i10 & 4) != 0) {
            z6 = Float.compare(f10, (float) 0) > 0;
        }
        boolean z10 = z6;
        long j10 = AbstractC14325C.f44961a;
        return (Float.compare(f10, (float) 0) > 0 || z10) ? interfaceC10459q.mo428M(new ShadowGraphicsLayerElement(f10, c20416d, z10, j10, j10)) : interfaceC10459q;
    }
}
