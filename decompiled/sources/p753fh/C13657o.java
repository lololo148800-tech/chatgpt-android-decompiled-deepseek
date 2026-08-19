package p753fh;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: fh.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13657o implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13657o f43130a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C13657o c13657o = new C13657o();
        f43130a = c13657o;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponseAccountInfo", c13657o, 6);
        pluginGeneratedSerialDescriptor.m18453j("account", false);
        pluginGeneratedSerialDescriptor.m18453j("lastActiveSubscription", false);
        pluginGeneratedSerialDescriptor.m18453j("entitlement", false);
        pluginGeneratedSerialDescriptor.m18453j("features", false);
        pluginGeneratedSerialDescriptor.m18453j("canAccessWithSession", false);
        pluginGeneratedSerialDescriptor.m18453j("ssoConnectionName", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C13654l.f43120a, C13663u.f43142a, C13660r.f43138a, AbstractC9961r4.m10615b(C13659q.f43131g[3]), C11164g.f33804a, AbstractC9961r4.m10615b(C11181o0.f33827a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C13659q.f43131g;
        C13656n c13656n = null;
        C13665w c13665w = null;
        C13662t c13662t = null;
        Set set = null;
        String str = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    c13656n = (C13656n) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C13654l.f43120a, c13656n);
                    i10 |= 1;
                    break;
                case 1:
                    c13665w = (C13665w) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C13663u.f43142a, c13665w);
                    i10 |= 2;
                    break;
                case 2:
                    c13662t = (C13662t) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C13660r.f43138a, c13662t);
                    i10 |= 4;
                    break;
                case 3:
                    set = (Set) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], set);
                    i10 |= 8;
                    break;
                case 4:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C13659q(i10, c13656n, c13665w, c13662t, set, zMo5481o, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13659q value = (C13659q) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C13658p c13658p = C13659q.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C13654l.f43120a, value.f43132a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C13663u.f43142a, value.f43133b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C13660r.f43138a, value.f43134c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C13659q.f43131g[3], value.f43135d);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, value.f43136e);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, value.f43137f);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
