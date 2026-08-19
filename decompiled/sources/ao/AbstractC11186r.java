package ao;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11186r extends AbstractC11152a {

    /* JADX INFO: renamed from: a */
    public final KSerializer f33837a;

    public AbstractC11186r(KSerializer kSerializer) {
        this.f33837a = kSerializer;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        mo12392i(obj, i10, interfaceC10428a.mo5490y(getDescriptor(), i10, this.f33837a, null));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo12392i(Object obj, int i10, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        AbstractC16544l.m18094g(encoder, "encoder");
        int iMo12361d = mo12361d(obj);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5587u = encoder.mo5587u(descriptor, iMo12361d);
        Iterator itMo12368c = mo12368c(obj);
        for (int i10 = 0; i10 < iMo12361d; i10++) {
            interfaceC10429bMo5587u.mo5575i(getDescriptor(), i10, this.f33837a, itMo12368c.next());
        }
        interfaceC10429bMo5587u.mo5569b(descriptor);
    }
}
