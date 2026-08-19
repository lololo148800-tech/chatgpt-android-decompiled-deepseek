package bn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: bn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C11512d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C11512d f34835Y = new C11512d();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String it = (String) obj;
        AbstractC16544l.m18094g(it, "it");
        SignatureBuildingComponents.INSTANCE.getClass();
        return it.length() > 1 ? AbstractC10763a.m11047e(';', TokenNames.f32014L, it) : it;
    }
}
