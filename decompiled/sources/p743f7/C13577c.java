package p743f7;

/* JADX INFO: renamed from: f7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13577c {

    /* JADX INFO: renamed from: a */
    public static final C13577c f42927a = new C13577c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13577c)) {
            return false;
        }
        ((C13577c) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (((((((int) 524288) * 31) + 500) * 31) + ((int) 4194304)) * 31) + ((int) 64800000);
    }

    public final String toString() {
        return "FeatureStorageConfiguration(maxItemSize=524288, maxItemsPerBatch=500, maxBatchSize=4194304, oldBatchThreshold=64800000)";
    }
}
