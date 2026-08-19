package p1155zi;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
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

/* JADX INFO: renamed from: zi.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22063u0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C22063u0 f69764a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C22063u0 c22063u0 = new C22063u0();
        f69764a = c22063u0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.DalleOperationAssetPointer", c22063u0, 8);
        pluginGeneratedSerialDescriptor.m18453j("imageOperationType", true);
        pluginGeneratedSerialDescriptor.m18454k(new C22059t0(new String[]{"type"}));
        pluginGeneratedSerialDescriptor.m18453j("originalAssetPointer", true);
        pluginGeneratedSerialDescriptor.m18453j("maskAssetPointer", true);
        pluginGeneratedSerialDescriptor.m18453j("originalGenId", false);
        pluginGeneratedSerialDescriptor.m18453j("originalParentGenId", false);
        pluginGeneratedSerialDescriptor.m18453j("inPaintingImage", true);
        pluginGeneratedSerialDescriptor.m18453j(SDPKeywords.PROMPT, true);
        pluginGeneratedSerialDescriptor.m18453j("messageId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C22071w0.f69773i[0];
        C21899C c21899c = C21899C.f69433a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c21899c);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c21899c);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializer, kSerializerM10615b, kSerializerM10615b2, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C21977Y0.f69577a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22071w0.f69773i;
        boolean z6 = true;
        String str = null;
        int i10 = 0;
        EnumC21968V0 enumC21968V0 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    enumC21968V0 = (EnumC21968V0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC21968V0);
                    i10 |= 1;
                    break;
                case 1:
                    C21907E c21907e = (C21907E) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21899C.f69433a, str2 != null ? new C21907E(str2) : null);
                    str2 = c21907e != null ? c21907e.f69451a : null;
                    i10 |= 2;
                    break;
                case 2:
                    C21907E c21907e2 = (C21907E) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C21899C.f69433a, str3 != null ? new C21907E(str3) : null);
                    str3 = c21907e2 != null ? c21907e2.f69451a : null;
                    i10 |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str4);
                    i10 |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str5);
                    i10 |= 16;
                    break;
                case 5:
                    str6 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str6);
                    i10 |= 32;
                    break;
                case 6:
                    str7 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str7);
                    i10 |= 64;
                    break;
                case 7:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C21977Y0.f69577a, str != null ? new C21984a1(str) : null);
                    str = c21984a1 != null ? c21984a1.f69607Y : null;
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C22071w0(i10, enumC21968V0, str2, str3, str4, str5, str6, str7, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C22071w0 value = (C22071w0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C22067v0 c22067v0 = C22071w0.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC21968V0 enumC21968V0 = value.f69774a;
        if (zMo5565F || enumC21968V0 != EnumC21968V0.Transformation) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22071w0.f69773i[0], enumC21968V0);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f69775b;
        if (zMo5565F2 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21899C.f69433a, str != null ? new C21907E(str) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f69776c;
        if (zMo5565F3 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C21899C.f69433a, str2 != null ? new C21907E(str2) : null);
        }
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f69777d);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c11181o0, value.f69778e);
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f69779f;
        if (zMo5565F4 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c11181o0, str3);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f69780g;
        if (zMo5565F5 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, c11181o0, str4);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str5 = value.f69781h;
        if (zMo5565F6 || str5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C21977Y0.f69577a, str5 != null ? new C21984a1(str5) : null);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
