package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassicTypeCheckerStateKt {
    public static final TypeCheckerState createClassicTypeCheckerState(boolean z6, boolean z10, ClassicTypeSystemContext typeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(typeSystemContext, "typeSystemContext");
        AbstractC16544l.m18094g(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new TypeCheckerState(z6, z10, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ TypeCheckerState createClassicTypeCheckerState$default(boolean z6, boolean z10, ClassicTypeSystemContext classicTypeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            classicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
        }
        if ((i10 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.Default.INSTANCE;
        }
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = KotlinTypeRefiner.Default.INSTANCE;
        }
        return createClassicTypeCheckerState(z6, z10, classicTypeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
