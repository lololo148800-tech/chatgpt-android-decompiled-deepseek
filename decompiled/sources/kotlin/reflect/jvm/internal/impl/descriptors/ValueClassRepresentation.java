package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ValueClassRepresentation<Type extends RigidTypeMarker> {
    public ValueClassRepresentation(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract boolean containsPropertyWithName(Name name);

    public final <Other extends SimpleTypeMarker> ValueClassRepresentation<Other> mapUnderlyingType(InterfaceC1436k transform) {
        AbstractC16544l.m18094g(transform, "transform");
        if (this instanceof InlineClassRepresentation) {
            InlineClassRepresentation inlineClassRepresentation = (InlineClassRepresentation) this;
            return new InlineClassRepresentation(inlineClassRepresentation.getUnderlyingPropertyName(), (RigidTypeMarker) transform.invoke(inlineClassRepresentation.getUnderlyingType()));
        }
        if (!(this instanceof MultiFieldValueClassRepresentation)) {
            throw new C0644w();
        }
        List<C17309l> underlyingPropertyNamesToTypes = ((MultiFieldValueClassRepresentation) this).getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(underlyingPropertyNamesToTypes, 10));
        for (C17309l c17309l : underlyingPropertyNamesToTypes) {
            arrayList.add(new C17309l((Name) c17309l.f55136Y, transform.invoke((RigidTypeMarker) c17309l.f55137Z)));
        }
        return new MultiFieldValueClassRepresentation(arrayList);
    }
}
