package com.withpersona.sdk2.inquiry.governmentid.network;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker_SupplementaryDataJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AutoClassifyWorker_SupplementaryDataJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40637a;

    public AutoClassifyWorker_SupplementaryDataJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40637a = C11475v.m12866a(new String[0]);
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        while (reader.hasNext()) {
            if (reader.mo12819v0(this.f40637a) == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            }
        }
        reader.mo12818m();
        return new AutoClassifyWorker$SupplementaryData();
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        AutoClassifyWorker$SupplementaryData autoClassifyWorker$SupplementaryData = (AutoClassifyWorker$SupplementaryData) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (autoClassifyWorker$SupplementaryData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(58, "GeneratedJsonAdapter(AutoClassifyWorker.SupplementaryData)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
