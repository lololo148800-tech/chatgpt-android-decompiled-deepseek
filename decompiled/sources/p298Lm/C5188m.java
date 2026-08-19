package p298Lm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import p544W9.AbstractC8710s3;

/* JADX INFO: renamed from: Lm.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5188m extends AbstractC8710s3 {

    /* JADX INFO: renamed from: a */
    public final Field f16873a;

    public C5188m(Field field) {
        AbstractC16544l.m18094g(field, "field");
        this.f16873a = field;
    }

    @Override // p544W9.AbstractC8710s3
    /* JADX INFO: renamed from: a */
    public final String mo5751a() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.f16873a;
        String name = field.getName();
        AbstractC16544l.m18093f(name, "getName(...)");
        sb2.append(JvmAbi.getterName(name));
        sb2.append("()");
        Class<?> type = field.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(type));
        return sb2.toString();
    }
}
