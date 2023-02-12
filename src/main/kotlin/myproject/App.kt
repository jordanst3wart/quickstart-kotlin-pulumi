package myproject

import com.pulumi.Pulumi
import com.pulumi.aws.s3.Bucket
import com.pulumi.Context

fun main(args: Array<String>) {
    Pulumi.run(::run)
}


fun run(ctx: Context) {
    val bucket = Bucket("my-bucket")
    ctx.export("bucketName", bucket.bucket())
}
