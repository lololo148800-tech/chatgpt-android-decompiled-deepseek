package ao;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: ao.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C11156c extends AbstractC11138L {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11156c(SerialDescriptor serialDescriptor, int i10) {
        super(serialDescriptor);
        this.f33794b = i10;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        switch (this.f33794b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
