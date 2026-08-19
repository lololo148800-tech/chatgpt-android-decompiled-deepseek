package p298Lm;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mm.C17309l;
import mm.C17315r;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;

/* JADX INFO: renamed from: Lm.W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5160W implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16810Y;

    /* JADX INFO: renamed from: Z */
    public final C5162Y f16811Z;

    public /* synthetic */ C5160W(C5162Y c5162y, int i10) {
        this.f16810Y = i10;
        this.f16811Z = c5162y;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        KotlinClassHeader classHeader;
        switch (this.f16810Y) {
            case 0:
                C5162Y c5162y = this.f16811Z;
                c5162y.getClass();
                InterfaceC3776x interfaceC3776x = C5162Y.f16815g[0];
                ReflectKotlinClass reflectKotlinClass = (ReflectKotlinClass) c5162y.f16816c.invoke();
                if (reflectKotlinClass == null) {
                    return MemberScope.Empty.INSTANCE;
                }
                InterfaceC3776x interfaceC3776x2 = AbstractC5142H.f16779b[0];
                Object objInvoke = c5162y.f16780a.invoke();
                AbstractC16544l.m18093f(objInvoke, "getValue(...)");
                return ((RuntimeModuleData) objInvoke).getPackagePartScopeCache().getPackagePartScope(reflectKotlinClass);
            default:
                C5162Y c5162y2 = this.f16811Z;
                c5162y2.getClass();
                InterfaceC3776x interfaceC3776x3 = C5162Y.f16815g[0];
                ReflectKotlinClass reflectKotlinClass2 = (ReflectKotlinClass) c5162y2.f16816c.invoke();
                if (reflectKotlinClass2 == null || (classHeader = reflectKotlinClass2.getClassHeader()) == null) {
                    return null;
                }
                String[] data = classHeader.getData();
                String[] strings = classHeader.getStrings();
                if (data == null || strings == null) {
                    return null;
                }
                C17309l packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                return new C17315r((JvmNameResolver) packageDataFrom.f55136Y, (ProtoBuf.Package) packageDataFrom.f55137Z, classHeader.getMetadataVersion());
        }
    }
}
