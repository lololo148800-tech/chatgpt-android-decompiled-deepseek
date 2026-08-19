package ao;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: ao.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11159d0 extends AbstractC11138L {

    /* JADX INFO: renamed from: b */
    public final String f33797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11159d0(SerialDescriptor primitive) {
        super(primitive);
        AbstractC16544l.m18094g(primitive, "primitive");
        this.f33797b = primitive.mo10679a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f33797b;
    }
}
