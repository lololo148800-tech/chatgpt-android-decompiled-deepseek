package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import om.C18238e;

/* JADX INFO: loaded from: classes2.dex */
public final class Visibilities {
    public static final Visibilities INSTANCE = new Visibilities();

    /* JADX INFO: renamed from: a */
    public static final C18238e f51421a;

    public static final class Inherited extends Visibility {
        public static final Inherited INSTANCE = new Inherited("inherited", false);
    }

    public static final class Internal extends Visibility {
        public static final Internal INSTANCE = new Internal("internal", false);
    }

    public static final class InvisibleFake extends Visibility {
        public static final InvisibleFake INSTANCE = new InvisibleFake("invisible_fake", false);
    }

    public static final class Local extends Visibility {
        public static final Local INSTANCE = new Local("local", false);
    }

    public static final class Private extends Visibility {
        public static final Private INSTANCE = new Private("private", false);
    }

    public static final class PrivateToThis extends Visibility {
        public static final PrivateToThis INSTANCE = new PrivateToThis("private_to_this", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    public static final class Protected extends Visibility {
        public static final Protected INSTANCE = new Protected("protected", true);
    }

    public static final class Public extends Visibility {
        public static final Public INSTANCE = new Public("public", true);
    }

    public static final class Unknown extends Visibility {
        public static final Unknown INSTANCE = new Unknown("unknown", false);
    }

    static {
        C18238e c18238e = new C18238e();
        c18238e.put(PrivateToThis.INSTANCE, 0);
        c18238e.put(Private.INSTANCE, 0);
        c18238e.put(Internal.INSTANCE, 1);
        c18238e.put(Protected.INSTANCE, 1);
        c18238e.put(Public.INSTANCE, 2);
        f51421a = c18238e.m19755b();
    }

    public final Integer compareLocal$compiler_common(Visibility first, Visibility second) {
        AbstractC16544l.m18094g(first, "first");
        AbstractC16544l.m18094g(second, "second");
        if (first == second) {
            return 0;
        }
        C18238e c18238e = f51421a;
        Integer num = (Integer) c18238e.get(first);
        Integer num2 = (Integer) c18238e.get(second);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean isPrivate(Visibility visibility) {
        AbstractC16544l.m18094g(visibility, "visibility");
        return visibility == Private.INSTANCE || visibility == PrivateToThis.INSTANCE;
    }
}
