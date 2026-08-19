package ao;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import p631Zn.InterfaceC10428a;

/* JADX INFO: renamed from: ao.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11152a implements KSerializer {
    /* JADX INFO: renamed from: a */
    public abstract Object mo12366a();

    /* JADX INFO: renamed from: b */
    public abstract int mo12367b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Iterator mo12368c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract int mo12361d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return m12377e(decoder);
    }

    /* JADX INFO: renamed from: e */
    public final Object m12377e(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        Object objMo12366a = mo12366a();
        int iMo12367b = mo12367b(objMo12366a);
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(getDescriptor());
        while (true) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(getDescriptor());
            if (iMo10914s == -1) {
                interfaceC10428aMo5471c.mo5470b(getDescriptor());
                return mo12369h(objMo12366a);
            }
            mo12362f(interfaceC10428aMo5471c, iMo10914s + iMo12367b, objMo12366a, true);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6);

    /* JADX INFO: renamed from: g */
    public abstract Object mo12363g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo12369h(Object obj);
}
