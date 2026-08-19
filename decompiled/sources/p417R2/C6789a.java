package p417R2;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: R2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6789a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C6789a f21794Y = new C6789a(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC16544l.m18094g(entry, "entry");
        return "  " + ((C6795g) entry.getKey()).f21804a + " = " + entry.getValue();
    }
}
