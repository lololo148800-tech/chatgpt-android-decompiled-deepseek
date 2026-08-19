package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionRequirementTable {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final VersionRequirementTable f52585b = new VersionRequirementTable(C17689w.f56480Y);

    /* JADX INFO: renamed from: a */
    public final List f52586a;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final VersionRequirementTable create(ProtoBuf.VersionRequirementTable table) {
            AbstractC16544l.m18094g(table, "table");
            if (table.getRequirementCount() == 0) {
                return getEMPTY();
            }
            List<ProtoBuf.VersionRequirement> requirementList = table.getRequirementList();
            AbstractC16544l.m18093f(requirementList, "getRequirementList(...)");
            return new VersionRequirementTable(requirementList, null);
        }

        public final VersionRequirementTable getEMPTY() {
            return VersionRequirementTable.f52585b;
        }
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public VersionRequirementTable(List list) {
        this.f52586a = list;
    }
}
