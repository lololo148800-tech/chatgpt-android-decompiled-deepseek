package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAttributeTranslators {

    /* JADX INFO: renamed from: a */
    public final List f53273a;

    public TypeAttributeTranslators(List<? extends TypeAttributeTranslator> translators) {
        AbstractC16544l.m18094g(translators, "translators");
        this.f53273a = translators;
    }

    public final List<TypeAttributeTranslator> getTranslators() {
        return this.f53273a;
    }
}
