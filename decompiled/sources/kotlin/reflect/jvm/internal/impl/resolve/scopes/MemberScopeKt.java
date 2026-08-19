package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p909nm.AbstractC17686t;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberScopeKt {
    public static final Set<Name> flatMapClassifierNamesOrNull(Iterable<? extends MemberScope> iterable) {
        AbstractC16544l.m18094g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<Name> classifierNames = it.next().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            AbstractC17686t.m19398v(classifierNames, hashSet);
        }
        return hashSet;
    }
}
