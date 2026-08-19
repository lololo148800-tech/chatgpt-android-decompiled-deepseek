package p298Lm;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p882m1.clb.WGTYqNchEpHca;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Lm.G0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5141G0 {

    /* JADX INFO: renamed from: a */
    public static final DescriptorRenderer f16778a = DescriptorRenderer.FQ_NAMES_IN_TYPES;

    /* JADX INFO: renamed from: b */
    public static String m5707b(FunctionDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        m5706a(sb2, descriptor);
        Name name = descriptor.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        sb2.append(f16778a.renderName(name, true));
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        AbstractC16544l.m18093f(valueParameters, "getValueParameters(...)");
        AbstractC17680n.m19347W(valueParameters, sb2, ", ", (124 & 4) != 0 ? "" : Separators.LPAREN, (124 & 8) != 0 ? "" : Separators.RPAREN, -1, "...", (124 & 64) != 0 ? null : C5166b.f16833w0);
        sb2.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        AbstractC16544l.m18091d(returnType);
        sb2.append(m5709d(returnType));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m5708c(PropertyDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.isVar() ? "var " : "val ");
        m5706a(sb2, descriptor);
        Name name = descriptor.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        sb2.append(f16778a.renderName(name, true));
        sb2.append(": ");
        KotlinType type = descriptor.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        sb2.append(m5709d(type));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m5709d(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
        return f16778a.renderType(type);
    }

    /* JADX INFO: renamed from: a */
    public static void m5706a(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        boolean z6;
        ReceiverParameterDescriptor receiverParameterDescriptorM5719g = AbstractC5147J0.m5719g(callableMemberDescriptor);
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        String str = WGTYqNchEpHca.ctKuuSZPAxdaNL;
        if (receiverParameterDescriptorM5719g != null) {
            KotlinType type = receiverParameterDescriptorM5719g.getType();
            AbstractC16544l.m18093f(type, str);
            sb2.append(m5709d(type));
            sb2.append(Separators.DOT);
        }
        if (receiverParameterDescriptorM5719g != null && extensionReceiverParameter != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            sb2.append(Separators.LPAREN);
        }
        if (extensionReceiverParameter != null) {
            KotlinType type2 = extensionReceiverParameter.getType();
            AbstractC16544l.m18093f(type2, str);
            sb2.append(m5709d(type2));
            sb2.append(Separators.DOT);
        }
        if (z6) {
            sb2.append(Separators.RPAREN);
        }
    }
}
