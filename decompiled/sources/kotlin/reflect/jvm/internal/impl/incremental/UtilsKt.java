package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final void record(LookupTracker lookupTracker, LookupLocation from, ClassDescriptor scopeOwner, Name name) {
        LocationInfo location;
        AbstractC16544l.m18094g(lookupTracker, "<this>");
        AbstractC16544l.m18094g(from, "from");
        AbstractC16544l.m18094g(scopeOwner, "scopeOwner");
        AbstractC16544l.m18094g(name, "name");
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = from.getLocation()) == null) {
            return;
        }
        Position position = lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION();
        String filePath = location.getFilePath();
        String strAsString = DescriptorUtils.getFqName(scopeOwner).asString();
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String strAsString2 = name.asString();
        AbstractC16544l.m18093f(strAsString2, "asString(...)");
        lookupTracker.record(filePath, position, strAsString, scopeKind, strAsString2);
    }

    public static final void recordPackageLookup(LookupTracker lookupTracker, LookupLocation from, String packageFqName, String name) {
        LocationInfo location;
        AbstractC16544l.m18094g(lookupTracker, "<this>");
        AbstractC16544l.m18094g(from, "from");
        AbstractC16544l.m18094g(packageFqName, "packageFqName");
        AbstractC16544l.m18094g(name, "name");
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = from.getLocation()) == null) {
            return;
        }
        lookupTracker.record(location.getFilePath(), lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION(), packageFqName, ScopeKind.PACKAGE, name);
    }

    public static final void record(LookupTracker lookupTracker, LookupLocation from, PackageFragmentDescriptor scopeOwner, Name name) {
        AbstractC16544l.m18094g(lookupTracker, "<this>");
        AbstractC16544l.m18094g(from, "from");
        AbstractC16544l.m18094g(scopeOwner, "scopeOwner");
        AbstractC16544l.m18094g(name, "name");
        String strAsString = scopeOwner.getFqName().asString();
        String strAsString2 = name.asString();
        AbstractC16544l.m18093f(strAsString2, "asString(...)");
        recordPackageLookup(lookupTracker, from, strAsString, strAsString2);
    }
}
