package p298Lm;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p024Am.C0560a;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p1113xn.C21317k;
import p544W9.AbstractC8710s3;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.C17662G;

/* JADX INFO: renamed from: Lm.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5191n0 implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16877Y;

    /* JADX INFO: renamed from: Z */
    public final AbstractC5203t0 f16878Z;

    public /* synthetic */ C5191n0(AbstractC5203t0 abstractC5203t0, int i10) {
        this.f16877Y = i10;
        this.f16878Z = abstractC5203t0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Class<?> enclosingClass;
        AbstractC5203t0 abstractC5203t0 = this.f16878Z;
        switch (this.f16877Y) {
            case 0:
                ClassId classId = AbstractC5143H0.f16781a;
                AbstractC8710s3 abstractC8710s3M5711b = AbstractC5143H0.m5711b(abstractC5203t0.mo5738m());
                if (!(abstractC8710s3M5711b instanceof C5192o)) {
                    if (abstractC8710s3M5711b instanceof C5188m) {
                        return ((C5188m) abstractC8710s3M5711b).f16873a;
                    }
                    if ((abstractC8710s3M5711b instanceof C5190n) || (abstractC8710s3M5711b instanceof C5194p)) {
                        return null;
                    }
                    throw new C0644w();
                }
                C5192o c5192o = (C5192o) abstractC8710s3M5711b;
                JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, c5192o.f16880b, c5192o.f16882d, c5192o.f16883e, false, 8, null);
                if (jvmFieldSignature$default == null) {
                    return null;
                }
                PropertyDescriptor propertyDescriptor = c5192o.f16879a;
                boolean zIsPropertyWithBackingFieldInOuterClass = DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(propertyDescriptor);
                AbstractC5148K abstractC5148K = abstractC5203t0.f16910s0;
                if (zIsPropertyWithBackingFieldInOuterClass || JvmProtoBufUtil.isMovedFromInterfaceCompanion(c5192o.f16880b)) {
                    enclosingClass = abstractC5148K.mo5684d().getEnclosingClass();
                } else {
                    DeclarationDescriptor containingDeclaration = propertyDescriptor.getContainingDeclaration();
                    enclosingClass = containingDeclaration instanceof ClassDescriptor ? AbstractC5147J0.m5723k((ClassDescriptor) containingDeclaration) : abstractC5148K.mo5684d();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            default:
                AbstractC5148K abstractC5148K2 = abstractC5203t0.f16910s0;
                abstractC5148K2.getClass();
                String name = abstractC5203t0.f16911t0;
                AbstractC16544l.m18094g(name, "name");
                String signature = abstractC5203t0.f16912u0;
                AbstractC16544l.m18094g(signature, "signature");
                C21317k c21317kM21663c = AbstractC5148K.f16787Y.m21663c(signature);
                if (c21317kM21663c != null) {
                    String str = (String) ((C17662G) c21317kM21663c.m21657a()).get(1);
                    PropertyDescriptor propertyDescriptorMo5687l = abstractC5148K2.mo5687l(Integer.parseInt(str));
                    if (propertyDescriptorMo5687l != null) {
                        return propertyDescriptorMo5687l;
                    }
                    StringBuilder sbM11058p = AbstractC10763a.m11058p("Local property #", str, " not found in ");
                    sbM11058p.append(abstractC5148K2.mo5684d());
                    throw new C0560a(sbM11058p.toString());
                }
                Name nameIdentifier = Name.identifier(name);
                AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
                Collection collectionMo5688o = abstractC5148K2.mo5688o(nameIdentifier);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionMo5688o) {
                    if (AbstractC16544l.m18089b(AbstractC5143H0.m5711b((PropertyDescriptor) obj).mo5751a(), signature)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbM9896o = AbstractC9306j0.m9896o("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbM9896o.append(abstractC5148K2);
                    throw new C0560a(sbM9896o.toString());
                }
                if (arrayList.size() == 1) {
                    return (PropertyDescriptor) AbstractC17680n.m19365o0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    DescriptorVisibility visibility = ((PropertyDescriptor) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new C5176g(2));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                AbstractC16544l.m18093f(collectionValues, "<get-values>(...)");
                List list = (List) AbstractC17680n.m19350Z(collectionValues);
                if (list.size() == 1) {
                    return (PropertyDescriptor) AbstractC17680n.m19341Q(list);
                }
                Name nameIdentifier2 = Name.identifier(name);
                AbstractC16544l.m18093f(nameIdentifier2, "identifier(...)");
                String strM19349Y = AbstractC17680n.m19349Y(abstractC5148K2.mo5688o(nameIdentifier2), Separators.RETURN, null, null, 0, null, C5166b.f16831u0, 30);
                StringBuilder sbM9896o2 = AbstractC9306j0.m9896o("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbM9896o2.append(abstractC5148K2);
                sbM9896o2.append(':');
                sbM9896o2.append(strM19349Y.length() == 0 ? " no members found" : Separators.RETURN.concat(strM19349Y));
                throw new C0560a(sbM9896o2.toString());
        }
    }
}
