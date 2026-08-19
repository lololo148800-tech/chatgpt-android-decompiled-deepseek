package p973qn;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: renamed from: qn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C18783e extends EnumC18784f {
    public C18783e() {
        super("UNKNOWN", 2);
    }

    @Override // p973qn.EnumC18784f
    /* JADX INFO: renamed from: a */
    public final EnumC18784f mo20052a(UnwrappedType nextType) {
        AbstractC16544l.m18094g(nextType, "nextType");
        EnumC18784f enumC18784fM20053b = EnumC18784f.m20053b(nextType);
        return enumC18784fM20053b == EnumC18784f.f59688Z ? this : enumC18784fM20053b;
    }
}
