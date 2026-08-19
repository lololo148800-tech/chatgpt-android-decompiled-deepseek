package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a */
    public final Name f51398a;

    /* JADX INFO: renamed from: b */
    public final RigidTypeMarker f51399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(Name underlyingPropertyName, Type underlyingType) {
        super(null);
        AbstractC16544l.m18094g(underlyingPropertyName, "underlyingPropertyName");
        AbstractC16544l.m18094g(underlyingType, "underlyingType");
        this.f51398a = underlyingPropertyName;
        this.f51399b = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return AbstractC16544l.m18089b(this.f51398a, name);
    }

    public final Name getUnderlyingPropertyName() {
        return this.f51398a;
    }

    public final Type getUnderlyingType() {
        return (Type) this.f51399b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f51398a + ", underlyingType=" + this.f51399b + ')';
    }
}
