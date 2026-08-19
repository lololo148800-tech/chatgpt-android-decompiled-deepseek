package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21319m;

/* JADX INFO: loaded from: classes2.dex */
public final class NameUtils {
    public static final NameUtils INSTANCE = new NameUtils();

    /* JADX INFO: renamed from: a */
    public static final C21319m f52683a = new C21319m("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: b */
    public static final String f52684b = "$context_receiver";

    public static final Name contextReceiverName(int i10) {
        Name nameIdentifier = Name.identifier(f52684b + '_' + i10);
        AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    public static final String sanitizeAsJavaIdentifier(String name) {
        AbstractC16544l.m18094g(name, "name");
        return f52683a.m21665e(name, "_");
    }
}
