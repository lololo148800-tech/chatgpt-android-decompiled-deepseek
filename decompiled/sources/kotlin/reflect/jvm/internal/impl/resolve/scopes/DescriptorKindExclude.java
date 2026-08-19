package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {
        public static final NonExtensions INSTANCE = new NonExtensions();

        /* JADX INFO: renamed from: a */
        public static final int f52916a;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
            f52916a = (~(companion.getVARIABLES_MASK() | companion.getFUNCTIONS_MASK())) & companion.getALL_KINDS_MASK();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return f52916a;
        }
    }

    public static final class TopLevelPackages extends DescriptorKindExclude {
        public static final TopLevelPackages INSTANCE = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int getFullyExcludedDescriptorKinds() {
            return 0;
        }
    }

    public abstract int getFullyExcludedDescriptorKinds();

    public String toString() {
        return getClass().getSimpleName();
    }
}
