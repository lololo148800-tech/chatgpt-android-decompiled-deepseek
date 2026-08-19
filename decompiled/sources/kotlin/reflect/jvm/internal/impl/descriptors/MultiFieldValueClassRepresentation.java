package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import mm.C17309l;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFieldValueClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a */
    public final List f51403a;

    /* JADX INFO: renamed from: b */
    public final Map f51404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiFieldValueClassRepresentation(List<? extends C17309l> underlyingPropertyNamesToTypes) {
        super(null);
        AbstractC16544l.m18094g(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f51403a = underlyingPropertyNamesToTypes;
        Map mapM19253o = AbstractC17659D.m19253o(getUnderlyingPropertyNamesToTypes());
        if (mapM19253o.size() != getUnderlyingPropertyNamesToTypes().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f51404b = mapM19253o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return this.f51404b.containsKey(name);
    }

    public List<C17309l> getUnderlyingPropertyNamesToTypes() {
        return this.f51403a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + ')';
    }
}
