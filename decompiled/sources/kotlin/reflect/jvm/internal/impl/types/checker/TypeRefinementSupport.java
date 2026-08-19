package kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRefinementSupport {

    public static final class Enabled extends TypeRefinementSupport {
        public final KotlinTypeRefiner getTypeRefiner() {
            return null;
        }
    }

    public final boolean isEnabled() {
        return false;
    }
}
