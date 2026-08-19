package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import bj.AbstractC11471r;
import bj.C11447L;
import bj.InterfaceC11470q;
import bj.InterfaceC11472s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p459Sj.C7143a;
import p523V9.AbstractC7877E4;
import p680cj.C11760a;
import p775h2.AbstractC14376f;
import tm.InterfaceC20006a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.Id */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11472s(generateAdapter = true)
@Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0003./0B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0011R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010\u000fR\u0011\u0010,\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Landroid/os/Parcelable;", "", "class", "", "requiresSides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", ParameterNames.ICON, "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "capturePageConfigs", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClass", "Ljava/util/List;", "getRequiresSides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "getIcon", "getCapturePageConfigs", "isDynamicGovId", "()Z", "Companion", "IdIcon", "IdLocalIcon", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class C12893Id implements Parcelable {
    private final List<CapturePageConfig> capturePageConfigs;
    private final String class;
    private final IdIcon icon;
    private final List<String> requiresSides;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<C12893Id> CREATOR = new Creator();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.Id$Companion, reason: from kotlin metadata */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$Companion;", "", "<init>", "()V", "Lbj/q;", "createAdapter", "()Lbj/q;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC11471r createAdapter$lambda$0(Type type, Set set, C11447L c11447l) {
            if (AbstractC16544l.m18089b(type, CapturePageConfig.RuleType.class)) {
                new C11760a(CapturePageConfig.RuleType.class, false);
                return new C11760a(CapturePageConfig.RuleType.class, true);
            }
            if (AbstractC16544l.m18089b(type, CapturePageConfig.OverlayLocalIcon.class)) {
                new C11760a(CapturePageConfig.OverlayLocalIcon.class, false);
                return new C11760a(CapturePageConfig.OverlayLocalIcon.class, true);
            }
            if (!AbstractC16544l.m18089b(type, IdLocalIcon.class)) {
                return null;
            }
            new C11760a(IdLocalIcon.class, false);
            return new C11760a(IdLocalIcon.class, true);
        }

        public final InterfaceC11470q createAdapter() {
            return new C7143a(0);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.Id$Creator */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Creator implements Parcelable.Creator<C12893Id> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C12893Id createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            IdIcon idIconCreateFromParcel = parcel.readInt() == 0 ? null : IdIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                int iM21251v = 0;
                while (iM21251v != i10) {
                    iM21251v = AbstractC20734X.m21251v(CapturePageConfig.CREATOR, parcel, arrayList2, iM21251v, 1);
                }
                arrayList = arrayList2;
            }
            return new C12893Id(string, arrayListCreateStringArrayList, idIconCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C12893Id[] newArray(int i10) {
            return new C12893Id[i10];
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.Id$IdIcon */
    @InterfaceC11472s(generateAdapter = true)
    @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "iconFallback", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)V", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lmm/C;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "getIconFallback", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final /* data */ class IdIcon implements Parcelable {
        public static final Parcelable.Creator<IdIcon> CREATOR = new Creator();
        private final IdLocalIcon iconFallback;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.Id$IdIcon$Creator */
        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class Creator implements Parcelable.Creator<IdIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon createFromParcel(Parcel parcel) {
                return new IdIcon(parcel.readInt() == 0 ? null : IdLocalIcon.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IdIcon[] newArray(int i10) {
                return new IdIcon[i10];
            }
        }

        public IdIcon(IdLocalIcon idLocalIcon) {
            this.iconFallback = idLocalIcon;
        }

        public static /* synthetic */ IdIcon copy$default(IdIcon idIcon, IdLocalIcon idLocalIcon, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                idLocalIcon = idIcon.iconFallback;
            }
            return idIcon.copy(idLocalIcon);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public final IdIcon copy(IdLocalIcon iconFallback) {
            return new IdIcon(iconFallback);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdIcon) && this.iconFallback == ((IdIcon) other).iconFallback;
        }

        public final IdLocalIcon getIconFallback() {
            return this.iconFallback;
        }

        public int hashCode() {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                return 0;
            }
            return idLocalIcon.hashCode();
        }

        public String toString() {
            return "IdIcon(iconFallback=" + this.iconFallback + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            IdLocalIcon idLocalIcon = this.iconFallback;
            if (idLocalIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(idLocalIcon.name());
            }
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.Id$IdLocalIcon */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdLocalIcon;", "", "(Ljava/lang/String;I)V", "WORLD", "CARD", "FLAG", "HOUSE", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @InterfaceC11472s(generateAdapter = false)
    public enum IdLocalIcon {
        WORLD,
        CARD,
        FLAG,
        HOUSE;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    public C12893Id(String str, List<String> list, IdIcon idIcon, List<CapturePageConfig> list2) {
        this.class = str;
        this.requiresSides = list;
        this.icon = idIcon;
        this.capturePageConfigs = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C12893Id copy$default(C12893Id c12893Id, String str, List list, IdIcon idIcon, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c12893Id.class;
        }
        if ((i10 & 2) != 0) {
            list = c12893Id.requiresSides;
        }
        if ((i10 & 4) != 0) {
            idIcon = c12893Id.icon;
        }
        if ((i10 & 8) != 0) {
            list2 = c12893Id.capturePageConfigs;
        }
        return c12893Id.copy(str, list, idIcon, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClass() {
        return this.class;
    }

    public final List<String> component2() {
        return this.requiresSides;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<CapturePageConfig> component4() {
        return this.capturePageConfigs;
    }

    public final C12893Id copy(String str, List<String> requiresSides, IdIcon icon, List<CapturePageConfig> capturePageConfigs) {
        return new C12893Id(str, requiresSides, icon, capturePageConfigs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12893Id)) {
            return false;
        }
        C12893Id c12893Id = (C12893Id) other;
        return AbstractC16544l.m18089b(this.class, c12893Id.class) && AbstractC16544l.m18089b(this.requiresSides, c12893Id.requiresSides) && AbstractC16544l.m18089b(this.icon, c12893Id.icon) && AbstractC16544l.m18089b(this.capturePageConfigs, c12893Id.capturePageConfigs);
    }

    public final List<CapturePageConfig> getCapturePageConfigs() {
        return this.capturePageConfigs;
    }

    public final String getClass() {
        return this.class;
    }

    public final IdIcon getIcon() {
        return this.icon;
    }

    public final List<String> getRequiresSides() {
        return this.requiresSides;
    }

    public int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.requiresSides, this.class.hashCode() * 31, 31);
        IdIcon idIcon = this.icon;
        int iHashCode = (iM15858x + (idIcon == null ? 0 : idIcon.hashCode())) * 31;
        List<CapturePageConfig> list = this.capturePageConfigs;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean isDynamicGovId() {
        return this.capturePageConfigs != null;
    }

    public String toString() {
        return "Id(class=" + this.class + ", requiresSides=" + this.requiresSides + ", icon=" + this.icon + ", capturePageConfigs=" + this.capturePageConfigs + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.class);
        parcel.writeStringList(this.requiresSides);
        IdIcon idIcon = this.icon;
        if (idIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            idIcon.writeToParcel(parcel, flags);
        }
        List<CapturePageConfig> list = this.capturePageConfigs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<CapturePageConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
