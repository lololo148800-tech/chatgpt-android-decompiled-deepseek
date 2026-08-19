package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p077Cn.C1756x;

/* JADX INFO: loaded from: classes2.dex */
public final class TypedArrayValue extends ArrayValue {

    /* JADX INFO: renamed from: c */
    public final KotlinType f52889c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(List<? extends ConstantValue<?>> value, KotlinType type) {
        super(value, new C1756x(type, 22));
        AbstractC16544l.m18094g(value, "value");
        AbstractC16544l.m18094g(type, "type");
        this.f52889c = type;
    }

    public final KotlinType getType() {
        return this.f52889c;
    }
}
