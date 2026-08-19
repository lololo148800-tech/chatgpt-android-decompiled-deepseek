package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public interface LookupTracker {

    public static final class DO_NOTHING implements LookupTracker {
        public static final DO_NOTHING INSTANCE = new DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public boolean getRequiresPosition() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        public void record(String filePath, Position position, String scopeFqName, ScopeKind scopeKind, String name) {
            AbstractC16544l.m18094g(filePath, "filePath");
            AbstractC16544l.m18094g(position, "position");
            AbstractC16544l.m18094g(scopeFqName, "scopeFqName");
            AbstractC16544l.m18094g(scopeKind, "scopeKind");
            AbstractC16544l.m18094g(name, "name");
        }
    }

    boolean getRequiresPosition();

    void record(String str, Position position, String str2, ScopeKind scopeKind, String str3);
}
