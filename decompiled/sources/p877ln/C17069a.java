package p877ln;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;

/* JADX INFO: renamed from: ln.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C17069a {

    /* JADX INFO: renamed from: a */
    public final ClassId f54546a;

    /* JADX INFO: renamed from: b */
    public final ClassData f54547b;

    public C17069a(ClassId classId, ClassData classData) {
        AbstractC16544l.m18094g(classId, "classId");
        this.f54546a = classId;
        this.f54547b = classData;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17069a) {
            if (AbstractC16544l.m18089b(this.f54546a, ((C17069a) obj).f54546a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f54546a.hashCode();
    }
}
